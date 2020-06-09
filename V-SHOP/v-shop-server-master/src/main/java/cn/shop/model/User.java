package cn.shop.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author 
 * @since 2020-06-10
 */
@TableName("sp_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 登录名
     */
    private String username;

    /**
     * qq官方唯一编号信息
     */
    @TableField("qq_open_id")
    private String qqOpenId;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 邮箱
     */
    @TableField("user_email")
    private String userEmail;

    /**
     * 新用户注册邮件激活唯一校验码
     */
    @TableField("user_email_code")
    private String userEmailCode;

    /**
     * 新用户是否已经通过邮箱激活帐号
     */
    @TableField("is_active")
    private String isActive;

    /**
     * 性别
     */
    @TableField("user_sex")
    private String userSex;

    /**
     * qq
     */
    @TableField("user_qq")
    private String userQq;

    /**
     * 手机
     */
    @TableField("user_tel")
    private String userTel;

    /**
     * 学历
     */
    @TableField("user_xueli")
    private String userXueli;

    /**
     * 爱好
     */
    @TableField("user_hobby")
    private String userHobby;

    /**
     * 简介
     */
    @TableField("user_introduce")
    private String userIntroduce;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Integer createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Integer updateTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserEmailCode() {
        return userEmailCode;
    }

    public void setUserEmailCode(String userEmailCode) {
        this.userEmailCode = userEmailCode;
    }
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }
    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
    public String getUserXueli() {
        return userXueli;
    }

    public void setUserXueli(String userXueli) {
        this.userXueli = userXueli;
    }
    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }
    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce;
    }
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", username=" + username +
        ", qqOpenId=" + qqOpenId +
        ", password=" + password +
        ", userEmail=" + userEmail +
        ", userEmailCode=" + userEmailCode +
        ", isActive=" + isActive +
        ", userSex=" + userSex +
        ", userQq=" + userQq +
        ", userTel=" + userTel +
        ", userXueli=" + userXueli +
        ", userHobby=" + userHobby +
        ", userIntroduce=" + userIntroduce +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
