package com.leetcode.listnode;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表两数之合 题目:https://leetcode-cn.com/problems/add-two-numbers/
 */
public class ListNodeSum {
    public static void main(String[] args) {
        List<Integer> values1 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            values1.add(9);
        }
        List<Integer> values2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            values2.add(9);
        }
        ListNode<Integer> header1 = ListNodeUtil.createListNode(values1);
        ListNode<Integer> header2 = ListNodeUtil.createListNode(values2);
        ListNodeUtil.printListNode(header1);
        ListNodeUtil.printListNode(header2);

        ListNode<Integer> result=addTwoNumbers(header1,header2);
        ListNodeUtil.printListNode(result);
    }

    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> header=null;
        ListNode<Integer> nodePoint=null;
        int number10Mode=0;
        while (l1 != null && l2 != null) {
            int number=l1.val+l2.val+number10Mode;
            if(number>=10){
                number10Mode=1;
                number=number-10;
            }else{
                number10Mode=0;
            }
            if(nodePoint==null){
                nodePoint=new ListNode<Integer>(number);
                header=nodePoint;
            }else{
                nodePoint.next=new ListNode<Integer>(number);
                nodePoint=nodePoint.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNodeUtil.printListNode(header);
        if(l1==null){
            while (l2 != null) {
                int number=l2.val+number10Mode;
                if(number>=10){
                    number10Mode=1;
                    number=number-10;
                }else{
                    number10Mode=0;
                }
                nodePoint.next=new ListNode<Integer>(number);
                nodePoint=nodePoint.next;
                l2 =l2.next;
            }
        }else{
            while (l1 != null) {
                int number=l1.val+number10Mode;
                if(number>=10){
                    number10Mode=1;
                    number=number-10;
                }else{
                    number10Mode=0;
                }
                nodePoint.next=new ListNode<Integer>(number);
                nodePoint=nodePoint.next;
                l1 =l1.next;
            }
        }
        if(number10Mode==1){
           nodePoint.next=new ListNode<Integer>(number10Mode);
        }
        return header;
    }
}
