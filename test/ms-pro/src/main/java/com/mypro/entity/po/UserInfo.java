package com.mypro.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

///此代码由代码生成器生成
///	&author:  jiangyixin
///	&date:  2025-5-27
public class UserInfo implements Serializable{


    /*
     * 用户id
     */
    private String id;


    /*
     * 注册时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;


    /*
     * 密码
     */
    private String password;


    /*
     * 头像
     */
    private String avatar;


    /*
     * 状态
     */
    private Integer status;


    /*
     * 最后登录ip
     */
    private String lastLoginIp;


    /*
     * 最后登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;


    /*
     * 用户简介
     */
    private String introduction;


    /*
     * 邮箱
     */
    private String email;

    private String name;


    /*
     * 性别
     */
    private Integer sex;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Date getCreateAt(){
        return this.createAt;
    }

    public void setCreateAt(Date createAt){
        this.createAt = createAt;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getAvatar(){
        return this.avatar;
    }

    public void setAvatar(String avatar){
        this.avatar = avatar;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public String getLastLoginIp(){
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp){
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime(){
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime){
        this.lastLoginTime = lastLoginTime;
    }

    public String getIntroduction(){
        return this.introduction;
    }

    public void setIntroduction(String introduction){
        this.introduction = introduction;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Integer getSex(){
        return this.sex;
    }

    public void setSex(Integer sex){
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString(){
//        return "id:\t"+(id==null?"空":id)+"\n"+"createAt:\t"+DateUtils.format(createAt,DateTimePatternEnum.YYYY_MM_DD.getPattern())+"\n"+"password:\t"+(password==null?"空":password)+"\n"+"avatar:\t"+(avatar==null?"空":avatar)+"\n"+"status:\t"+(status==null?"空":status.toString())+"\n"+"lastLoginIp:\t"+(lastLoginIp==null?"空":lastLoginIp)+"\n"+"lastLoginTime:\t"+DateUtils.format(lastLoginTime,DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())+"\n"+"introduction:\t"+(introduction==null?"空":introduction)+"\n"+"email:\t"+(email==null?"空":email)+"\n"+"sex:\t"+(sex==null?"空":sex.toString())+"\n";
//    }
}