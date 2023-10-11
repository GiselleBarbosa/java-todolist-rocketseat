package br.com.gisellebarbosa.todolist.user;

public class UserModel {

  public String username;
  public String name;
  public String password;

  // setters
  public void setUsername(String username) {
    this.username = username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // getters
  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

}
