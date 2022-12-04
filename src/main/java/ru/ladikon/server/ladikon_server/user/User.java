package ru.ladikon.server.ladikon_server.user;

import java.sql.Date;

public class User {
  public final String FREELANCER = "FREELANCER";
  public final String CUSTOMER = "CUSTOMER";

  private final String name;
  private final String surname;
  private final String patronymic;
  private final Date birthday;
  private final Date registrated;
  private final String phone;
  private final String user_type;

  public User(String name, String surname, String patronymic, Date birthday, Date registrated, String phone,
      String user_type) {
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.birthday = birthday;
    this.registrated = registrated;
    this.phone = phone;
    this.user_type = user_type;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public Date getBirthday() {
    return birthday;
  }

  public Date getRegistrationDate() {
    return registrated;
  }

  public String getPhone() {
    return phone;
  }

  public String getUserType() {
    return user_type;
  }

}
