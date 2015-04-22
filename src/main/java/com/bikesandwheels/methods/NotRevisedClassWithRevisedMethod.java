package com.bikesandwheels.methods;

import com.bikesandwheels.annotations.*;

public class NotRevisedClassWithRevisedMethod {
    @Revision(date = @Date(year = 2015, month = 4, day = 19))
    public void revisedMethod(Integer i, String s) {}
}
