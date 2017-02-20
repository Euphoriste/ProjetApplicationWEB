/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tests;
import com.mycompany.hibernate.Video;
import java.util.Date;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author HeloiseR
 */
public class TestHibernate {
    
    public static void main(String args[]) throws Exception {
        Configuration config = new Configuration();
        config.addClass(com.mycompany.hibernate.Video.class); 
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Video video = new Video("ぐでたまショートアニメ 第705話「ぎゅでちゃま誕生秘話」（1/30放送）",new Date(30/01/2017), "/ProjetApplicationWEB/videos/705130.mp4", null);
            session.save(video);
            session.flush();
            tx.commit();
        } catch (Exception e){
            if (tx != null){
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        sessionFactory.close();
    }
}
