package com.polly.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HobbyDto {
	private Long h_uid;	
	private Long h_cuid;	
	private String h_name;
}
