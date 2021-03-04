package com.leetcode.listnode;

import java.util.List;

public class ListNodeUtil{

    public static <T> ListNode<T> createListNode(List<T> values){
          ListNode<T> header=null;
          ListNode<T> listNodePoint=null;
          for(int i=0;i<values.size();i++){
              if(header==null){
                listNodePoint = new ListNode<T>(values.get(i));
                header=listNodePoint;
              }else{
                listNodePoint.next= new ListNode<T>(values.get(i));
                listNodePoint=listNodePoint.next;
              }
          }
          return header;
    }

    public static void printListNode(ListNode header) {
        ListNode listNodePoint=header;
        StringBuilder stringBuilder=new StringBuilder();
        while(listNodePoint!=null){
          if(stringBuilder.length()>0){
            stringBuilder.append(",");
          } 
          stringBuilder.append(listNodePoint.val.toString());
          listNodePoint=listNodePoint.next;
        }
        System.out.println("链表："+stringBuilder.toString());
    }
}