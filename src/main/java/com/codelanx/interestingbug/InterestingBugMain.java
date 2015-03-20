/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.interestingbug;

import com.codelanx.interestingbug.types.ChildTypeOne;
import com.codelanx.interestingbug.types.ChildTypeThree;
import com.codelanx.interestingbug.types.ChildTypeTwo;

/**
 * Class description for {@link InterestingBugMain}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class InterestingBugMain {

    public static final void main(String... args) {
        MyBugInterface main = BugEnum.SOME_CONSTANT;
        ChildTypeOne one = main.getConfig(); //runs fine
        ChildTypeTwo two = main.getConfig(); //not a compile time error, but a runtime casting exception
        ChildTypeThree three = main.getConfig(); //same as two
    }
}
