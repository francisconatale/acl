#include <iostream>
#include <algorithm>
#include <string>

struct MiComparador {
    bool operator()(const std::string& a, const std::string& b) const {
        // redefinís el criterio acá:
        // por ejemplo, ordenar por longitud y luego alfabéticamente
        if (a.size() == b.size())
            return a < b; 
        return a.size() < b.size();
    }
};

int main(int argc, char* argv[]) {
    if (argc <= 1) {
        std::cout << "No se proporcionaron argumentos." << std::endl;
        return 0;
    }

    std::vector<std::string> argumentos(argv + 1, argv + argc);

    // aplicamos sort con el comparador redefinido
    std::sort(argumentos.begin(), argumentos.end(), MiComparador());

    std::cout << "Argumentos ordenados:" << std::endl;
    for (const auto& arg : argumentos)
        std::cout << arg << std::endl;

    return 0;
}

