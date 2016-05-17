package com.absontheweb.abschat.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name="user")
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="id")
	private Long id;
	
	@Column(nullable=false, name="name", length=45)
	private String name;
	
	@Column(nullable=false, name="surname", length=45)
	private String surname;
	
	@Column(nullable=false, name="nickname", length=45)
	private String nickname;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="partecipants", 
		joinColumns={@JoinColumn(name="fk_user")},
		inverseJoinColumns={@JoinColumn(name="fk_chat")}		
	)
	private List<ChatEntity> chats;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
		name="contacts", 
		joinColumns={@JoinColumn(name="fk_user")},
		inverseJoinColumns={@JoinColumn(name="fk_contact")}		
	)
	private List<UserEntity> contacts;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public List<ChatEntity> getChats() {
		return chats;
	}

	public void setChats(List<ChatEntity> chats) {
		this.chats = chats;
	}
	
	public List<UserEntity> getContacts() {
		return contacts;
	}

	public void setContacts(List<UserEntity> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
}
