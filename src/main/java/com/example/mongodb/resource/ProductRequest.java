package com.example.mongodb.resource;

public class ProductRequest
{
    private  String name;
    private  String desc;

    public ProductRequest(){

    }

    public ProductRequest(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

