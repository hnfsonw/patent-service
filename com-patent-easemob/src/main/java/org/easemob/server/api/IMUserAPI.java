package org.easemob.server.api;

/**
 * 用户整合接口
 * @author Administrator
 *
 */
public interface IMUserAPI {
	/**
	 * 注册IM用户[单个] <br>
	 * POST
	 * 
	 * @param payload
	 *            <code>{"username":"${用户名}","password":"${密码}", "nickname":"${昵称值}"}</code>
	 * @return
	 */
	Object createNewIMUserSingle(Object payload);
	
	/**
	 * 注册IM用户[批量] <br>
	 * POST
	 * 
	 * @param payload
	 *            <code>[{"username":"${用户名1}","password":"${密码}"},…,{"username":"${用户名2}","password":"${密码}"}]</code>
	 * @return
	 */
	Object createNewIMUserBatch(Object payload);
	
	/**
	 * 获取IM用户[单个] <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object getIMUserByUserName(String userName);
	
	/**
	 * 获取IM用户[批量]，参数为空时默认返回最早创建的10个用户 <br>
	 * GET
	 * 
	 * @param limit
	 *            单页获取数量
	 * @param cursor
	 *            游标，大于单页记录时会产生
	 * @return
	 */
	Object getIMUsersBatch(Long limit, String cursor);
	
	/**
	 * 删除IM用户[单个] <br>
	 * DELETE
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object deleteIMUserByUserName(String userName);
	
	/**
	 * 删除IM用户[批量]，随机删除 <br>
	 * DELETE
	 * 
	 * @param limit
	 *            删除数量，建议100-500
	 * @return
	 */
	Object deleteIMUserBatch(Long limit, String cursor);
	
	/**
	 * 重置IM用户密码 <br>
	 * PUT
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @param payload
	 *            <code>{"newpassword" : "${新密码指定的字符串}"}</code>
	 * @return
	 */
	Object modifyIMUserPasswordWithAdminToken(String userName, Object payload);
	
	/**
	 * 修改用户昵称 <br>
	 * PUT
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @param payload
	 *            <code>{"nickname" : "${昵称值}"}</code>
	 * @return
	 */
	Object modifyIMUserNickNameWithAdminToken(String userName, Object payload);
	
	/**
	 * 给IM用户的添加好友 <br>
	 * POST
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @param friendName
	 *            好友用戶名或用戶ID
	 * @return
	 */
	Object addFriendSingle(String userName, String friendName);
	
	/**
	 * 解除IM用户的好友关系 <br>
	 * DELETE
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @param friendName
	 *            好友用戶名或用戶ID
	 * @return
	 */
	Object deleteFriendSingle(String userName, String friendName);
	
	/**
	 * 查看某个IM用户的好友信息 <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object getFriends(String userName);
	
	/**
	 * 查看用户在线状态 <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object getIMUserStatus(String userName);
	
	/**
	 * 查询离线消息数 <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object getOfflineMsgCount(String userName);
	
	/**
	 * 查询某条离线消息状态 <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @param msgId
	 *            消息ID
	 * @return
	 */
	Object getSpecifiedOfflineMsgStatus(String userName, String msgId);
	
	/**
	 * 用户账号禁用 <br>
	 * POST
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object deactivateIMUser(String userName);
	
	/**
	 * 用户账号解禁 <br>
	 * POST
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object activateIMUser(String userName);

	/**
	 * 强制用户下线 <br>
	 * GET
	 * 
	 * @param userName
	 *            用戶名或用戶ID
	 * @return
	 */
	Object disconnectIMUser(String userName);
	
	
}
