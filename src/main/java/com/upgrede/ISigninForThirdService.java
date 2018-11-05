package com.upgrede;

import com.old.ISigninService;
import com.old.ResultMsg;

/**
 * Created by sc on 2018/11/5.
 */
public interface ISigninForThirdService extends ISigninService {

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWechat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForTelphone(String telphone,String code);

    public ResultMsg loginForRegist(String username,String password);
}
