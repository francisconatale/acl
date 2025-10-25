#include <iostream>
#include <vector>
using namespace std;

template <typename T>
class List {
private:
    vector<T> elementos;
    int size;

public:
List(int initialSize) : elementos(initialSize), size(0) {}
List() : size(20) {}
  T tail(){
    return elementos.back();
  }

  void push(T item){
    if(elementos.size() == size){ elementos.resize(size*2);}
    elementos.insert(elementos.begin(), item);
    size++;
  }

  T head(){
    return elementos.front();
  }
   
  T pop(){
    int position = elementos.begin();
    T item = elementos.at(position);
    elementos.erase(position);
  }

  void show(){
    for(int i = 0; i < size; i++){
        cout << elementos.at(i) << " ";
    }
    }
};

int main() {
    List<int> lista(20);
    for(int i = 0; i < 50; i++){
        lista.push(i);
    }
    lista.show();
}