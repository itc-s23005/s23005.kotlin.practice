package jp.ac.it_college.std.s23005.practice.chap2

class User (val name: String)
    fun createUser(name: String?): User? {
        return name?.let { n -> User(n) }
}