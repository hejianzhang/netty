package com.tfzq.test.testData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
/**
 * Created by Administrator on 2017-07-04.
 */
public class xmlParse  {
    List<String> listString=new ArrayList<String>();
    String id1;
    List<Map<String,String>> listmap=new ArrayList<Map<String, String>>();
    Map<String,List<Map<String,String>>> map11=new HashMap<String, List<Map<String, String>>>();
    List<Map<String,List<Map<String,String>>>> list=new ArrayList<Map<String, List<Map<String, String>>>>();
    Map<String,List<Map<String,List<Map<String,String>>>>> map22=new HashMap<String, List<Map<String, List<Map<String, String>>>>>();
    List<Map<String,List<Map<String,List<Map<String,String>>>>>> list3=new ArrayList<Map<String, List<Map<String, List<Map<String, String>>>>>>();
    List<Map<String,List<Map<String,List<Map<String,String>>>>>> list4=new ArrayList<Map<String, List<Map<String, List<Map<String, String>>>>>>();
    Set<String> set=new HashSet<String>();
   public  List<Map<String,List<Map<String,List<Map<String,String>>>>>> readxmlData() throws Exception{
       SAXReader reader = new SAXReader();
       // ͨ��read������ȡһ���ļ� ת����Document����
       Document document = reader.read(new File("1.xml"));
       //��ȡ���ڵ�Ԫ�ض���
       Element node = document.getRootElement();
       //�������е�Ԫ�ؽڵ�

       listNodes(node);
       for(String s:listString){
           String[] ss=s.split(",");
           Map<String,String> m=new HashMap<String, String>();
           if(map22.get(ss[0])!=null&&map11.get(ss[1])!=null){
               m.put(ss[2], ss[3]);
               listmap.add(m);
               map11.put(ss[1], listmap);
               map22.put(ss[0], list);


           }else {
               if(list4.size()>0){
               list4.addAll(deepCopyList(list3));
               }else{
                   list4= deepCopyList(list3);
               }

               map11.clear();
               listmap.clear();
               list.clear();
               map22.clear();
               list3.clear();
               m.put(ss[2], ss[3]);
               listmap.add(m);
               map11.put(ss[1], listmap);
               list.add(map11);
               map22.put(ss[0], list);
               list3.add(map22);





           }








       }
       list4.addAll(deepCopyList(list3));
       for(Map<String,List<Map<String,List<Map<String,String>>>>> m:list4){
           Set<String> keySet = m.keySet();
           for(String key : keySet) {
            if(key.equals("10000802")){
                List<Map<String,List<Map<String,String>>>> tt=m.get(key);
                for(Map<String,List<Map<String,String>>> cc:tt){
                    Set<String> keySet1 = cc.keySet();
                    for(String key1 : keySet1) {
                        if(key1.contains("0001"));



                    }
                }

            }
           }

       }
       return list4;


       // д�뵽һ���µ��ļ���
//       writer(document);

    }
    public void listNodes(Element node) {
//        System.out.println("��ǰ�ڵ�����ƣ���" + node.getName());
        // ��ȡ��ǰ�ڵ���������Խڵ�
        List<Attribute> list = node.attributes();
        // �������Խڵ�
//        String s=null;
//        for (Attribute attr : list) {
//            s=attr.getValue();
//            System.out.println(attr.getValue()+"-----"+s);
//        }


        if (!(node.getTextTrim().equals(""))) {
            List<Attribute> list1=node.getParent().getParent().attributes();


            for (Attribute attr1:list1){
                    listString.add(attr1.getValue() +"," + node.getParent().attribute(0).getValue() + "," +node.getName()+ ","+node.getText());
                    System.out.println(attr1.getValue() +","+node.getParent().attribute(0).getValue()+ "," +node.getName()+ ","+node.getText());
                }


        }

        // ��ǰ�ڵ������ӽڵ������
        Iterator<Element> it = node.elementIterator();
        // ����
        while (it.hasNext()) {
            // ��ȡĳ���ӽڵ����
            Element e = it.next();
            // ���ӽڵ���б���

            listNodes(e);
        }
    }
    @SuppressWarnings("unchecked")
    public static <T> List<T> deepCopyList(List<T> src) throws Exception
    {
        List<T> dest = null;
        try
        {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(src);
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            dest = (List<T>) in.readObject();
        }
        catch (IOException e)
        {

        }
        catch (Exception e)
        {

        }
        return dest;
    }
    public  static  void main(String[] args) throws Exception {
        xmlParse xmlParse=new xmlParse();
        xmlParse.readxmlData();
    }



}
