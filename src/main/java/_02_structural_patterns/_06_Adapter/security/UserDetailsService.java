package _02_structural_patterns._06_Adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
