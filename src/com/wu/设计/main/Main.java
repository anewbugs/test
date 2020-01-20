package com.wu.设计.main;

import com.wu.设计.Connection;
import com.wu.设计.GameService;
import com.wu.设计.core.until.Req;

public class Main {
    public static void main(String[] args) {
        new Connection().prit();
        new GameService().prit();

        System.out.println(Connection.functions);
    }
}
