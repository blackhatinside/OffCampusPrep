/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<int> ans;
    void postorderUtil(Node* root) {
        if (root) {
            for (int i = 0; i < root->children.size(); i++) {
                this->postorderUtil(root->children[i]);
            }
            ans.push_back(root->val);
        }
    }
    vector<int> postorder(Node* root) {
        this->postorderUtil(root);
        return ans;
    }
};