package com.bikesandwheels.methods;

import com.bikesandwheels.annotations.*;

@History({@Revision(date = @Date(year = 2015, month = 4, day = 16))})
class HistoryRevisedClassWithHistoryRevisedMethod {
    @History({
            @Revision(date = @Date(year = 2015, month = 4, day = 17), authors = @Author("Paul"), comment = "algorithm implemented"),
            @Revision(date = @Date(year = 2015, month = 4, day = 18), authors = @Author("Paul"), comment = "bug fixed")
    })
    public Integer historyRevisedMethod(String s) {return 0;}
}
