package com.example.weather_project.repository;

import com.example.weather_project.domain.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
//@Transactional
class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

    @Test
    void insertMemoTest() {
        //given
        Memo newMemo = new Memo(1, "this is new memo");

        //when
        memoRepository.save(newMemo);

        //then
        Optional<Memo> result = memoRepository.findById(1);
        assertEquals(result.get().getText(), "this is new memo");
    }


    @Test
    void findAllMemoTest(){
        List<Memo> memoList = memoRepository.findAll();
        System.out.println(memoList);
        assertNotNull(memoList);
    }



}