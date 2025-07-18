package _02_structural_patterns._06_Adapter;

import _02_structural_patterns._06_Adapter.security.*;

public class Account {
    private String name, password, email;

    public String getName()             { return name; }
    public void setName(String name)    { this.name = name; }

    public String getPassword()                 { return password; }
    public void setPassword(String password)    { this.password = password; }

    public String getEmail()            { return email; }
    public void setEmail(String email)  { this.email = email; }
}
