package com.arundhaj.mrruncount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class RunCountMapper extends Mapper<Object, Text, Text, IntWritable> {

	@Override
	protected void map(Object key, Text value, Context output)
			throws IOException, InterruptedException {
		String[] tokens = value.toString().split(",");
		// tokens[0] - playerID
		// tokens[8] - runs
		int runs = 0;
		try {
			runs = Integer.parseInt(tokens[8]);
		} catch (NumberFormatException nfe) {
			runs = 0;
		}
		output.write(new Text(tokens[0]), new IntWritable(runs));
	}
}
