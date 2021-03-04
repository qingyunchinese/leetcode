package com.leetcode.listnode;

public class ListNode<T> {
    T val;
    ListNode<T> next;
    public ListNode() {}
    public ListNode(T val) { this.val = val; }
    public ListNode(T val, ListNode<T> next) { this.val = val; this.next = next; }
}
