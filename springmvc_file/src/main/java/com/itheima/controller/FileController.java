package com.itheima.controller;


import com.itheima.utils.UploadUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("springmvc")
public class FileController {

    /*@RequestMapping("upload")
    public String upload(MultipartFile icon, HttpServletRequest request) throws IOException {
        //1. 接收客户端上传的文件,就是icon
        //2. 准备一个文件夹，用于存储客户端上传的文件
        ServletContext servletContext = request.getSession().getServletContext();
        String realpath = servletContext.getRealPath("/upload");

        //3. 使用工具类创建一个随机目录
        String dir = UploadUtils.getDir();
        realpath += dir;

        File file = new File(realpath);
        if (!file.exists()) {
            //如果那个upload文件夹不存在则创建
            file.mkdirs();
        }

        //4. 存储文件的时候，使用唯一的文件名
        String fileName = UploadUtils.getUUIDName(icon.getOriginalFilename());

        icon.transferTo(new File(file,fileName));
        return "file upload success";
    }*/
    @RequestMapping("upload")
    public String upload(MultipartFile icon, HttpServletRequest request) throws IOException {
        //1. 接收客户端上传的文件,就是icon
        //2. 准备一个文件夹，用于存储客户端上传的文件
        ServletContext servletContext = request.getSession().getServletContext();
        String realpath = servletContext.getRealPath("/upload");

        //3. 使用工具类创建一个随机目录
        String dir = UploadUtils.getDir();
        realpath += dir;

        File file = new File(realpath);
        if (!file.exists()) {
            //如果那个upload文件夹不存在则创建
            file.mkdirs();
        }

        //4. 存储文件的时候，使用唯一的文件名
        String fileName = UploadUtils.getUUIDName(icon.getOriginalFilename());

        icon.transferTo(new File(file,fileName));
        return "file upload success";
    }

    private static final String FILESERVERURL="http://localhost:8888/uploads/";

    @RequestMapping(value = "fileUpload03",method = RequestMethod.POST)
    public String upload2(MultipartFile icon) throws IOException {
        //1. 获取一个随机的文件名
        String originalFilename = icon.getOriginalFilename();
        String uuidName = UploadUtils.getUUIDName(originalFilename);

        //图片服务器地址
        //String url = "http://localhost:8888/upload/";

        //2. 编写跨服务器文件上传的代码
        Client client = Client.create();
        //构造资源
        WebResource resource = client.resource(FILESERVERURL + uuidName);

        //将图片传输
//        resource.put(icon.getBytes());
        resource.put(icon.getBytes());
        return "file upload success";
    }
}

