class Solution {

    int maxGCD(Node root) {

        int maxg = 0;

        int num = 0;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty())

        {

            Node temp = q.poll();

            if (temp.left != null && temp.right != null)

            {

                int x = gcd(temp.left.data, temp.right.data);

                if (maxg <= x)

                {

                    maxg = x;

                    num = temp.data;

                }

                q.add(temp.left);

                q.add(temp.right);

            }

            else if (temp.left != null && temp.right == null)

            {

                q.add(temp.left);

            }

            else if (temp.left == null && temp.right != null) {

                q.add(temp.right);

            }

        }

        return num;

    }

    public int gcd(int x, int y) {

        if (x == 0) {

            return y;

        }

        return gcd(y % x, x);

    }

}