package cn.shop.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author 
 * @since 2020-06-10
 */
@TableName("sp_manager")
public class Manager extends Model<Manager> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "mg_id", type = IdType.AUTO)
    private Integer mgId;

    /**
     * 名称
     */
    @TableField("mg_name")
    private String mgName;

    /**
     * 密码
     */
    @TableField("mg_pwd")
    private String mgPwd;

    /**
     * salt
     */
    @TableField("mg_salt")
    private String mgSalt;

    /**
     * 注册时间
     */
    @TableField("mg_time")
    private Integer mgTime;

    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer roleId;

    @TableField("mg_mobile")
    private String mgMobile;

    @TableField("mg_email")
    private String mgEmail;

    /**
     * 1：表示启用 0:表示禁用
     */
    @TableField("mg_state")
    private Integer mgState;

    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }
    public String getMgName() {
        return mgName;
    }

    public void setMgName(String mgName) {
        this.mgName = mgName;
    }
    public String getMgPwd() {
        return mgPwd;
    }

    public void setMgPwd(String mgPwd) {
        this.mgPwd = mgPwd;
    }
    public String getMgSalt() {
        return mgSalt;
    }

    public void setMgSalt(String mgSalt) {
        this.mgSalt = mgSalt;
    }
    public Integer getMgTime() {
        return mgTime;
    }

    public void setMgTime(Integer mgTime) {
        this.mgTime = mgTime;
    }
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getMgMobile() {
        return mgMobile;
    }

    public void setMgMobile(String mgMobile) {
        this.mgMobile = mgMobile;
    }
    public String getMgEmail() {
        return mgEmail;
    }

    public void setMgEmail(String mgEmail) {
        this.mgEmail = mgEmail;
    }
    public Integer getMgState() {
        return mgState;
    }

    public void setMgState(Integer mgState) {
        this.mgState = mgState;
    }

    @Override
    protected Serializable pkVal() {
        return this.mgId;
    }

    @Override
    public String toString() {
        return "Manager{" +
        "mgId=" + mgId +
        ", mgName=" + mgName +
        ", mgPwd=" + mgPwd +
        ", mgSalt=" + mgSalt +
        ", mgTime=" + mgTime +
        ", roleId=" + roleId +
        ", mgMobile=" + mgMobile +
        ", mgEmail=" + mgEmail +
        ", mgState=" + mgState +
        "}";
    }
}
