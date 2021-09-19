package com.missclick.missbudgetcompose.di

import org.koin.dsl.module

val dataModule = module {

//    single {
//        provideRepository(get())
//    }
//    single {
//        provideRoomDb(get())
//    }
//    single {
//        provideLocale(get())
//    }


}

//
//fun provideRepository(localStatistic : ILocalStatistic): IJust {
//    return Just(localStatistic)
//}
//
//fun provideLocale(statisticDB: StatisticDB) : ILocalStatistic {
//    return LocalStatistic(statisticDB)
//}
//
//fun provideRoomDb(context: Context) : StatisticDB {
//    return Room.databaseBuilder(context, StatisticDB::class.java, "statistic")
//        .fallbackToDestructiveMigration()
//        .build()
//}