package semester2.jobsheet14;
public class BinaryTree14 {
    Node14 root;
    public BinaryTree14() {
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void add(Mahasiswa14 data) {
        Node14 newNode = new Node14(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node14 current = root;
            Node14 parent = null;
            while (true) {
                parent = current;
                if (data.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        break;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        break;
                    }
                }
            }
        }
    }
    public boolean find(double ipk) {
        Node14 current = root;
        while (current != null) {
            if (ipk == current.mahasiswa.ipk) {
                return true;
            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }
    public void traversePreOrder(Node14 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traverseInOrder(Node14 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node14 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    public Node14 getSuccessor(Node14 del) {
        Node14 successorParent = del;
        Node14 successor = del.right;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node14 parent = root;
        Node14 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Node dengan IPK " + ipk + " tidak ditemukan");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        else {
            Node14 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
        public void addRekursif(Mahasiswa14 data) {
            root = insertRekursif(root, data);
        }
            public Node14 insertRekursif(Node14 current, Mahasiswa14 data) {
            if (current == null) {
                return new Node14(data);
            }
            if (data.ipk < current.mahasiswa.ipk) {
                current.left = insertRekursif(current.left, data);
            } else {
                current.right = insertRekursif(current.right, data);
            }
            return current;
        }
        public void cariMinIPK() {
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return;
            }
            Node14 current = root;
            while (current.left != null) {
                current = current.left;
            }
            System.out.println("Data dengan IPK terkecil:");
            current.mahasiswa.tampilInformasi();
        }
        public void cariMaxIPK() {
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return;
            }
            Node14 current = root;
            while (current.right != null) {
                current = current.right;
            }
            System.out.println("Data dengan IPK terbesar:");
            current.mahasiswa.tampilInformasi();
        }
        public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilDiAtas(root, ipkBatas);
        }
        public void tampilDiAtas(Node14 node, double ipkBatas) {
        if (node != null) {
            tampilDiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilDiAtas(node.right, ipkBatas);
        }
    }
}
