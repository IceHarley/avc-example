package com.bikesandwheels.methods;

import com.bikesandwheels.annotations.*;

public class NotRevisedClassWithRevisedMethod {
    @Revision(date = @Date(year = 2015, month = 4, day = 19), authors = @Author("Alex"))
    public void revisedMethod(int i, String s) {}
}
