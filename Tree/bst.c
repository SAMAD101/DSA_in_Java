// Binary Search Tree (BST) implementatuon in C using Linked List

#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
};

struct node createNode(int data){
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return *newNode;
}

int main(){
    struct node root = createNode(1);
    struct node first = createNode(2);
    struct node second = createNode(3);
    root.left = &first;
    root.right = &second;
    printf("%d\n", root.data);
    printf("%d\n", root.left->data);
    printf("%d\n", root.right->data);
    
    return 0;
}