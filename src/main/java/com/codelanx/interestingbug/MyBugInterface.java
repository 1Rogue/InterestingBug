/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.interestingbug;

import com.codelanx.interestingbug.types.ParentType;

/**
 * Class description for {@link MyBugInterface}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public interface MyBugInterface { //Note, if you add a class-level generic witness then this bug resolves itself

    default public <T extends ParentType> T getConfig() {
        return this.<T>getData().get(this);
    }

    public <T extends ParentType> InstanceHolder<T> getData();

}
