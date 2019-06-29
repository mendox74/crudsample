package com.example.crudsample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import com.example.crudsample.domain.User;

import org.apache.ibatis.annotations.Delete;

@Mapper
public interface UserRepository {
	
	/*
	 * 登録者情報の全取得
	 */
	@Select("SELECT * FROM user ORDER BY id ASC")
	List<User> select();
	
	/*
	 * 登録者情報の1件取得
	 */
	@Select("SELECT * FROM user WHERE id = #{id}")
	User selectPK(int id);
	
	/*
	 * 新規登録者情報の挿入
	 */
	@Insert("INSERT INTO user(name,age,height,weight) VALUES(#{name},#{age},#{height},#{weight})")
	void insert (User user);
	
	/*
	 * 登録者情報の更新
	 */
	@Update("UPDATE user SET name = #{name}, age = #{age}, height = #{height}, weight = #{weight} WHERE id = #{id}")
	void updata (User user);
	
	/*
	 * 登録者情報の削除
	 */
	@Delete("DELETE FROM user WHERE id = #{id}")
	void deletePK (int id);
}
