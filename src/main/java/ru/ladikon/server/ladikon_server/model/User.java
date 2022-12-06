package ru.ladikon.server.ladikon_server.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "user_account")
public class User {
  @Transient
  @JsonIgnore
  public final String FREELANCER = "FREELANCER";

  @Transient
  @JsonIgnore
  public final String CUSTOMER = "CUSTOMER";

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "patronymic")
  private String patronymic;

  @Column(name = "birthday")
  private Date birthday;

  @Column(name = "registrated_at")
  private Date registrated_at;

  @Column(name = "phone")
  private String phone;

  @Column(name = "password")
  private String password;

  @Column(name = "account_type")
  @JsonProperty("account_type")
  private String account_type;

  @Column(name = "tokens")
  private List<String> tokens;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSurname() {
    return surname;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setRegistrationDate(Date registrated_at) {
    this.registrated_at = registrated_at;
  }

  public Date getRegistrationDate() {
    return registrated_at;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  @JsonSetter("account_type")
  public void setAccountType(String account_type) {
    this.account_type = account_type;
  }

  @JsonGetter("account_type")
  public String getAccountType() {
    return account_type;
  }

  @JsonSetter("tokens")
  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  @JsonGetter("tokens")
  public List<String> getTokens() {
    return tokens;
  }

}
