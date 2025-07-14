package _02_structural_patterns._06_Adapter.security;

import _02_structural_patterns._06_Adapter.AccountService;
import _02_structural_patterns._06_Adapter.AccountUserDetails;

public class AccountUserDetailsService implements UserDetailsService {
    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
