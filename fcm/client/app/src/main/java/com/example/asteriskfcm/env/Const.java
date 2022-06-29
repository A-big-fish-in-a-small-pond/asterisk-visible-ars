package com.example.asteriskfcm.env;

public class Const {
    private static String FSM_SERVER = "127.0.0.1";
    private static String FSM_PORT = "80";
    private static String FSM_PATH_INSERT = "/insert";

    public static String getFsmServer() {
        return FSM_SERVER;
    }

    public static String getFsmPort() {
        return FSM_PORT;
    }

    public static String getFsmPathInsert() {
        return FSM_PATH_INSERT;
    }
}
