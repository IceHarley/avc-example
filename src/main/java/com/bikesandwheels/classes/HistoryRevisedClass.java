package com.bikesandwheels.classes;

import com.bikesandwheels.annotations.*;

@History({
        @Revision(
                date = @Date(year = 2015, month = 4, day = 6),
                comment = "revision 1",
                authors = {@Author("John"), @Author("Jack")}
        ),
        @Revision(
                date = @Date(year = 2015, month = 4, day = 7),
                comment = "revision 2",
                authors = {@Author("Jack"), @Author("Mike")}
        )
})
public class HistoryRevisedClass {
}
