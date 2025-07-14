package _02_structural_patterns._06_Adapter;

import _02_structural_patterns._06_Adapter.security.*;

public class App {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("yeonwoo", "yeonwoo");
        System.out.println(login);
    }
}
