package com.example.popularhero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection {

    private static HttpURLConnection connection;

    public static void main(String[] args) {

        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try{

            URL url = new URL("https://bitbucket.org/dttden/mobile-coding-challenge/raw/2ee8bd47703c62c5d217d9fb9e0306922a34e581/");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if(status > 299){

                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

                while((line = reader.readLine()) != null){

                    responseContent.append(line);
                }
                reader.close();
            }

        }catch(MalformedURLException e){

            e.printStackTrace();

        }catch (IOException e){

            e.printStackTrace();
        }finally {
            connection.disconnect();
        }

    }
}
