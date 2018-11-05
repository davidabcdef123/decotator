package com.upgrede;

import com.old.ISigninService;
import com.old.ResultMsg;

/**
 * Created by sc on 2018/11/5.
 */
public class SigninForThirdServiceImpl implements ISigninForThirdService {

    private ISigninService service;
    public SigninForThirdServiceImpl(ISigninService service){
        this.service = service;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        this.regist(username,null);
        return this.login(username,null);
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return service.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return service.login(username,password);
    }
}
