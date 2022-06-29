package com.example.asteriskfcm.utils.network;

import android.content.ContentValues;
import android.os.AsyncTask;

import java.net.HttpURLConnection;

public class AsyncAxios extends AsyncTask<Void, Void, String> {

    private String url;
    private ContentValues values;

    public AsyncAxios(String url, ContentValues values) {
        this.url = url;
        this.values = values;
    }

    @Override
    protected String doInBackground(Void... params) {

        String result = ""; // 요청 결과를 저장할 변수.
//        RequestHttpURLConnection requestHttpURLConnection = new RequestHttpURLConnection();
//        result = requestHttpURLConnection.request(url, values); // 해당 URL로 부터 결과물을 얻어온다.

        return result;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
