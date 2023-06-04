package cn.beehive.base.constant;

/**
 * @author hncboy
 * @date 2023-3-27
 * 应用相关常量
 */
public interface ApplicationConstant {

    /**
     * ADMIN 路径前缀
     */
    String ADMIN_PATH_PREFIX = "admin";

    /**
     * 用户登录-JWT携带参数名称：注册类型 code
     */
    String FRONT_JWT_REGISTER_TYPE_CODE = "registerTypeCode";

    /**
     * 用户登录-JWT 携带参数名称：登录账号
     */
    String FRONT_JWT_USERNAME = "username";

    /**
     * 用户登录-JWT 携带参数名称：extraUserId
     */
    String FRONT_JWT_EXTRA_USER_ID = "extraUserId";

    /**
     * CellConfig在生成系统默认值时的系统用户ID
     */
    Integer ROOM_PARAM_SYSTEM_USER_ID = 0;
    /**
     * CellConfig在生成系统默认Room时的房间ID
     */
    Integer ROOM_PARAM_ROOM_ID = 0;
}