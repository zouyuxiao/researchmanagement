package com.zhuoyue.researchManement.bean;

import com.google.gson.Gson;
import com.zhuoyue.researchManement.util.RSAUtils;

import javax.servlet.http.HttpSession;
import java.security.interfaces.RSAPrivateKey;
import java.util.Map;

public class Password {

    private String password;
    private String rePassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public static Password decrypt(String password, HttpSession session) {
        Password pwd = null;
        try {
            Map<String, Object> keypair = (Map<String, Object>) session.getAttribute(RSAUtils.KEYPAIR);
            session.removeAttribute(RSAUtils.KEYPAIR);

            if (keypair != null) pwd = new Gson().fromJson(RSAUtils.decrypt((RSAPrivateKey) keypair.get(RSAUtils.PRIVATE_KEY), password), Password.class);
        } catch (Exception e) {
        }
        return pwd;
    }
}
