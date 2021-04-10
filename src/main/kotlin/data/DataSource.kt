package data

abstract class DataSource {
    abstract fun getJobById(id: String): String
    abstract fun getJobs(): List<String>
}

class RemoteDataSource : DataSource() {
    override fun getJobById(id: String): String {
        TODO("Not yet implemented")
    }

    override fun getJobs(): List<String> {
        TODO("Not yet implemented")
    }

}

class LocalDataSource: DataSource(){
    override fun getJobById(id: String): String {
        TODO("Not yet implemented")
    }

    override fun getJobs(): List<String> {
        TODO("Not yet implemented")
    }

}

class Repository(

){
    lateinit var localDataSource: LocalDataSource
    lateinit var remoteDataSource: RemoteDataSource


}