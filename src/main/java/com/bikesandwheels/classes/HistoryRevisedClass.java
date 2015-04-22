package com.bikesandwheels.classes;

import com.bikesandwheels.annotations.*;

@History({
        @Revision(
                date = @Date(year = 2015, month = 4, day = 6),
                comment = "revision 1",
                authors = {@Author("class_author1"), @Author("class_author2")}
        ),
        @Revision(
                date = @Date(year = 2015, month = 4, day = 7),
                comment = "revision 2",
                authors = {@Author("class_author2"), @Author("class_author3")}
        )
})
public class HistoryRevisedClass {
}
