package chatbean;

public enum TypeValue {
	
	//client to server
	MES_READ,
	REQ_REGISTER,
	REQ_LOGIN,
	REQ_BIND,
	REQ_FORGET_PASSWORD,
	REQ_CHECK_CAPTCHA,
	REQ_GET_INFO, REQ_EDIT_INFO,
	REQ_CHAT,
	REQ_FILE,
	REQ_ADJUST_GROUP_ORDER,
	REQ_EDIT_GROUP_NAME,
	REQ_EDIT_REMARK,
	REQ_BUILD_GROUP,
	REQ_MOVE_GROUP,
	REQ_ADD_FRIEND,
	REQ_ACCEPT_FRIEND,
	REQ_REMOVE_FRIEND,
	REQ_REMOVE_GROUP,
	REQ_DELETE_RECORD,

	//server to client
	RECV_CHAT,
	RECV_FILE,
	RECV_OFFLINE,
	RECV_ADD_FRIEND,
	RECV_UPDATE_FRIEND,
	REPLY_OK,
	REPLY_SERVER_ERROR,
	REPLY_BAD_ID,
	REPLY_CHECK_FAILED
	;
}
