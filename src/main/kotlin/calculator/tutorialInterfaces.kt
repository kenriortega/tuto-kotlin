package calculator

fun main() {
    // It`s can be use for DI - get from ctor or setter ok
    val fileSystem: FileSystem = getFileSystem()
    fileSystem.readDir()
}

fun getFileSystem(): FileSystem {
    return MemoryFileSystem(listOf("/dev/to", "/home/kali"), "file-content")
}

interface FileSystem {
    fun readDir(): List<String>
    fun readFile(): String
}

class Fat32FileSystem : FileSystem {
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }

}

class ExtFileSystem : FileSystem {
    override fun readDir(): List<String> {
        TODO("Not yet implemented")
    }

    override fun readFile(): String {
        TODO("Not yet implemented")
    }
}

class MemoryFileSystem(val files: List<String>, val fileContent: String) : FileSystem {
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContent
    }

}


interface Discountable {
    fun discountPercent(): Double
    fun foo()
}

class DigitalProduct : Discountable {
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }

    override fun foo() {
        TODO("Not yet implemented")
    }

}

class GenericToy : Discountable {
    override fun discountPercent(): Double {
        TODO("Not yet implemented")
    }

    override fun foo() {
        TODO("Not yet implemented")
    }

}