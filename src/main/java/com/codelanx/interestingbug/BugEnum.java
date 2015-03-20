/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.interestingbug;

import com.codelanx.interestingbug.types.ChildTypeOne;

/**
 * Class description for {@link BugEnum}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public enum BugEnum implements MyBugInterface {

    SOME_CONSTANT;

    private static final InstanceHolder<ChildTypeOne> DATA = new InstanceHolder<>(ChildTypeOne.class);

    @Override
    public InstanceHolder<ChildTypeOne> getData() {
        return BugEnum.DATA;
    }

}
