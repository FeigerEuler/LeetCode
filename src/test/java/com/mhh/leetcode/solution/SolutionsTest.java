package com.mhh.leetcode.solution;


import com.mhh.leetcode.LeetcodeApplication;
import com.mhh.leetcode.solutions.Solution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LeetcodeApplication.class)
public class SolutionsTest {

    @Autowired
    private Solution solution;

    @Test
    public void helloTest(){
        solution.hello();
    }


    @Test
    public void maxAreaTest(){
        int [] a= new int[]{2,3,4,5,18,17,6};

        System.out.println(solution.maxArea(a));
    }

}
