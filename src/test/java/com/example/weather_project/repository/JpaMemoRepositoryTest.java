package com.example.weather_project.repository;


import com.example.weather_project.domain.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class JpaMemoRepositoryTest {

    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest(){
        //givne
        Memo newMemo = new Memo(10, "hello");


        //when
        jpaMemoRepository.save(newMemo);

        //then
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertTrue(memoList.size()> 0);
    }


    @Test
    void findByIdTest(){
        //givne
        Memo newMemo = new Memo(11, "hello");

        //when
        jpaMemoRepository.save(newMemo);

        //then
        Optional<Memo> result = jpaMemoRepository.findById(newMemo.getId());
        assertEquals(result.get().getText(), "hello");
    }


}
