package com.arundhaj.mrruncount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class RunCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values, Context output)
			throws IOException, InterruptedException {
		int runCount = 0;
		
		for(IntWritable value: values) {
			runCount += value.get();
		}
		
		output.write(key, new IntWritable(runCount));
	}
}
