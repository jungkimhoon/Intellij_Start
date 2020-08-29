package com.example.restfulweb.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private int id;

    private String description;

    // User : Post -> 1 : N, Main : Sub -> Parent : Child
    // 한 사용자가 여러 게시글 작성 가능
    @ManyToOne(fetch = FetchType.LAZY) //지연로딩방식
    @JsonIgnore //외부 노출 X
    private User user;
}
